package com.lcb.observer_pattern;

/**
 * @author lichangbao
 */
public interface Observer {
	
	void update(AbstractObservable o, Object args);
}
