/*
 * package com.cts.imsproj.purchase;
 * 
 * import static org.mockito.Mockito.verify;
 * 
 * import java.util.Collections;
 * 
 * import org.junit.jupiter.api.Test; import org.junit.runner.RunWith; import
 * org.mockito.Mockito; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest; import
 * org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.boot.test.mock.mockito.MockBean; import
 * org.springframework.http.MediaType; import
 * org.springframework.test.context.junit4.SpringRunner; import
 * org.springframework.test.web.servlet.MockMvc; import
 * org.springframework.test.web.servlet.MvcResult; import
 * org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
 * 
 * import com.cts.imsproj.purchase.dao.SupplierRepository; import
 * com.cts.imsproj.purchase.service.RawService;
 * 
 * @SpringBootTest
 * 
 * @RunWith(SpringRunner.class)
 * 
 * @WebMvcTest class ImsPurchasingDeptApplicationTests {
 * 
 * @Autowired MockMvc mockMvc;
 * 
 * @Autowired SupplierRepository sprepo;
 * 
 * @MockBean RawService service;
 * 
 * @Test void contextLoads() throws Exception{
 * Mockito.when(service.getAll()).thenReturn(Collections.emptyList()); MvcResult
 * mvcResult =
 * mockMvc.perform(MockMvcRequestBuilders.get("/api/getall").accept(MediaType.
 * APPLICATION_JSON)).andReturn(); System.out.println(mvcResult.getResponse());
 * verify(service).getAll(); }
 * 
 * 
 * @Test void addSuppliers() { Supplier sp = new Supplier();
 * sp.setSupplierName("mani"); sp.setSupplierId(1); sp.setSupplierContact(8500);
 * sp.setSupplierCompany("MRF");
 * 
 * sprepo.save(sp); }
 * 
 * 
 * }
 */