package template;

import java.util.Iterator;
import java.util.List;

/**
 * @author: Vivian Xu
 */
public abstract class RemoveTemplate {
    public final void remove(List<String> list) {
        for (Iterator<String> iter = list.iterator(); iter.hasNext();) {
            String elt = iter.next();
            if (matches(elt))
                iter.remove();
        }
    }

    protected abstract boolean matches(String elt);
}
