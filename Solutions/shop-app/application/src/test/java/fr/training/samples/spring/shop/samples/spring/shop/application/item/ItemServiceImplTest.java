package fr.training.samples.spring.shop.samples.spring.shop.application.item;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import fr.training.samples.spring.shop.samples.spring.shop.domain.item.ItemEntity;
import fr.training.samples.spring.shop.samples.spring.shop.domain.item.ItemRepository;
import fr.training.samples.spring.shop.samples.spring.shop.domain.item.ItemVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Badr NASS
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ItemServiceImplTest {

	/**
	 * itemManagement of type ItemManagement
	 */
	@Autowired
	private ItemManagement itemManagement;

	/**
	 * itemRepository of type ItemRepository
	 */
	@MockBean
	private ItemRepository itemRepository;

	@Test
	public void testGetAllItems() {
		ItemEntity itemEntity = new ItemEntity(new ItemVO("DESC99", 99));
		List<ItemEntity> items = Arrays.asList(itemEntity);
		when(itemRepository.getAllItems()).thenReturn(items);
		List<ItemEntity> itemsResult = itemManagement.getAllItems();
		itemManagement.getAllItems();
		verify(itemRepository).getAllItems();
		itemManagement.getAllItems();
		verify(itemRepository).getAllItems();
		itemManagement.getAllItems();
		verify(itemRepository).getAllItems();
		assertNotNull(itemsResult);
		assertTrue(itemsResult.size() == 1);
	}

	@Test
	public void testAddItem() {
		ItemVO itemVO = new ItemVO("DESC99", 99);
		ItemEntity itemEntity = new ItemEntity(itemVO);
		when(itemRepository.addItem(itemEntity)).thenReturn(itemEntity);

		ItemEntity itemResultEntity = itemManagement.addItem(itemEntity);
		assertNotNull(itemResultEntity);
		assertEquals("DESC99", itemResultEntity.getItemVO().getDescription());
	}
}
