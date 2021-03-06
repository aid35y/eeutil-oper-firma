/*
 * Copyright (C) 2012-13 MINHAP, Gobierno de España This program is licensed and may be used,
 * modified and redistributed under the terms of the European Public License (EUPL), either version
 * 1.1 or (at your option) any later version as soon as they are approved by the European
 * Commission. Unless required by applicable law or agreed to in writing, software distributed under
 * the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions and
 * more details. You should have received a copy of the EUPL1.1 license along with this program; if
 * not, you may find it at http://joinup.ec.europa.eu/software/page/eupl/licence-eupl
 */

package es.mpt.dsic.inside.pdf.converter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.springframework.stereotype.Component;
import com.lowagie.text.Document;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Rectangle;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.pdf.RandomAccessFileOrArray;
import com.lowagie.text.pdf.codec.TiffImage;
import es.mpt.dsic.inside.pdf.PdfUtils;
import es.mpt.dsic.inside.pdf.exception.PdfConversionException;
import es.mpt.dsic.inside.utils.file.FileUtil;

@Component
public class TiffToPdfConverter {

  private static final String TIFF_PREFIX = "tiff";

  @SuppressWarnings({"unused"})
  public File convertTiffToPDF(File inputFile) throws PdfConversionException, IOException {

    String filePath = FileUtil.createFilePath(TIFF_PREFIX);
    FileInputStream fis = null;
    FileOutputStream fos = null;
    Document document = null;;
    RandomAccessFileOrArray ra = null;
    PdfWriter writer = null;
    try {
      document = new Document(PageSize.LETTER, 0, 0, 0, 0);

      fos = new FileOutputStream(filePath);

      writer = PdfWriter.getInstance(document, fos);

      int pages = 0;
      document.open();
      PdfContentByte cb = writer.getDirectContent();
      int comps = 0;

      fis = new FileInputStream(inputFile);
      ra = new RandomAccessFileOrArray(fis);
      comps = TiffImage.getNumberOfPages(ra);

      for (int c = 0; c < comps; ++c) {
        Image img = TiffImage.getTiffImage(ra, c + 1);
        if (img != null) {
          System.out.println("page " + (c + 1));
          img.scalePercent(7200f / img.getDpiX(), 7200f / img.getDpiY());
          document.setPageSize(new Rectangle(img.getScaledWidth(), img.getScaledHeight()));
          img.setAbsolutePosition(0, 0);
          cb.addImage(img);
          document.newPage();
          ++pages;
        }
      }

    } catch (Throwable t) {
      throw new PdfConversionException("Error convertTiffToPDF", t);
    } finally {
      PdfUtils.close(ra);
      PdfUtils.close(document);
      PdfUtils.close(writer);

      FileUtil.close(fis);
      FileUtil.close(fos);
    }
    return new File(filePath);

  }

}
