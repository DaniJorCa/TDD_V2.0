import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;


public class test_Coche_Daniel_Jordan {

	@Test
	public void test_al_crear_un_coche_su_velocidad_es_cero() {
		Coche nuevoCoche = new Coche();
		Assert.assertEquals(0, nuevoCoche.velocidad);
	}

}
