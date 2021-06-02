package seminar14_testareUnitara.teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import seminar14_testareUnitara.teste.categorii.TesteImportante;

@RunWith(Categories.class)
@IncludeCategory(TesteImportante.class)
@SuiteClasses({ TestStudent.class, TestStudentAlteTeste.class })
public class SuitaTesteImportante {

}
