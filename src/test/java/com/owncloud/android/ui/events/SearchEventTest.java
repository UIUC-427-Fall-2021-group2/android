package com.owncloud.android.ui.events;

import org.junit.Test;

import java.util.Arrays;

import static com.owncloud.android.lib.resources.files.SearchRemoteOperation.SearchType.FILE_SEARCH;
import static org.junit.Assert.assertTrue;

public class SearchEventTest {

    @Test
    public void testTrimming() {
        SearchEvent event = new SearchEvent("test ", FILE_SEARCH);
        assertTrue(event.getSearchQuery().equals("test"));
        SearchEvent event2 = new SearchEvent(" test", FILE_SEARCH);
        assertTrue(event2.getSearchQuery().equals("test"));
        SearchEvent event3 = new SearchEvent(" test ", FILE_SEARCH);
        assertTrue(event3.getSearchQuery().equals("test"));
        SearchEvent event4 = new SearchEvent("test", FILE_SEARCH);
        assertTrue(event4.getSearchQuery().equals("test"));
    }
}
