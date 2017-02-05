package org.dsaenz.jerlang.services;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/services")
public class DoorErlangApplication extends Application {

    private Set<Object> singletons = new HashSet<Object>(); private Set<Class<?>> empty = new HashSet<Class<?>>();

    public DoorErlangApplication() { singletons.add(new MessageResource());
    }

    @Override
    public Set<Class<?>> getClasses() { return empty;
    }

    @Override
    public Set<Object> getSingletons() { return singletons;
    }
}
