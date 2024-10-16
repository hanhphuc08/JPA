package vn.iostar.services.Impl;

import java.util.List;

import vn.iostar.entity.Category;
import vn.iostar.services.ICategoryService;
import vn.iostar.dao.ICategoryDao;
import vn.iostar.dao.Impl.CategoryDao;

public class CategoryService implements ICategoryService {
	ICategoryDao cateDao = new CategoryDao();

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return cateDao.count();
	}

	@Override
	public List<Category> findAll(int page, int pagesize) {
		// TODO Auto-generated method stub
		return cateDao.findAll(page, pagesize);
	}

	@Override
	public List<Category> findByCategoryName(String catname) {
		// TODO Auto-generated method stub
		return cateDao.findByCategoryName(catname);
	}

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return cateDao.findAll();
	}

	@Override
	public Category findById(int cateid) {
		// TODO Auto-generated method stub
		return cateDao.findById(cateid);
	}

	@Override
	public void delete(int cateid) throws Exception {
		// TODO Auto-generated method stub
		cateDao.delete(cateid);
	}

	@Override
	public void update(Category category) {
		// TODO Auto-generated method stub
		cateDao.update(category);
	}

	@Override
	public void insert(Category category) {
		// TODO Auto-generated method stub
		cateDao.insert(category);
	}

}
