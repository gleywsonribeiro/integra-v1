/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hmue.integra.model.dao;

import br.com.hmue.integra.model.MotivoServico;
import br.com.hmue.integra.model.OS;
import br.com.hmue.integra.model.TipoOS;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gleywson
 */
public class OSDaoTest {
    
    public OSDaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of buscar method, of class OSDao.
     */
    @Test
    public void testBuscar() {
        System.out.println("buscar");
        Long codigo = 98307L;
        
        OSDao instance = new OSDao();
        OS expResult = new OS();
        expResult.setCodigo(codigo);
        
        OS result = instance.buscar(codigo);
        System.out.println(result.getCodigo());
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of atualizar method, of class OSDao.
     */
    @Test
    public void testAtualizar() {
        System.out.println("atualizar");
        
        OSDao instance = new OSDao();
        OS os = instance.buscar(98307L);
        
        os.setDescricao("TROCA DE MOUSE UPDATE");
        
        instance.atualizar(os);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getTiposOS method, of class OSDao.
     */
    @Test
    public void testGetTiposOS() {
        System.out.println("getTiposOS");
        OSDao instance = new OSDao();
        List<TipoOS> expResult = null;
        List<TipoOS> result = instance.getTiposOS();
        System.out.println(result);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMotivos method, of class OSDao.
     */
    @Test
    public void testGetMotivos() {
        System.out.println("getMotivos");
        Long codigoTipoOs = null;
        OSDao instance = new OSDao();
        List<MotivoServico> expResult = null;
        List<MotivoServico> result = instance.getMotivos(codigoTipoOs);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSetor method, of class OSDao.
     */
    @Test
    public void testGetSetor() {
        System.out.println("getSetor");
        Long id = 8L;
        OSDao instance = new OSDao();
        String expResult = "TECNOLOGIA DA INFORMACAO";
        String result = instance.getSetor(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getLocalidade method, of class OSDao.
     */
    @Test
    public void testGetLocalidade() {
        System.out.println("getLocalidade");
        Long id = 12L;
        OSDao instance = new OSDao();
        String expResult = "COORDENAÇÃO TI";
        String result = instance.getLocalidade(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
