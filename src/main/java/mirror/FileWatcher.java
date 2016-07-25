package mirror;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.BlockingQueue;

import mirror.tasks.TaskLogic;

public interface FileWatcher extends TaskLogic {

  /**
   * Initializes watches on the rootDirectory, and returns a list of all of
   * the file paths found while setting up listening hooks.
   *
   * This scan is performed on-thread and so this method blocks until complete.
   */
  List<Update> performInitialScan(BlockingQueue<Update> queue) throws IOException, InterruptedException;

}
