package com.mytest.factories;

import java.util.List;

public interface IFactory<D> {
	
	List<D> generate(int count);
}
