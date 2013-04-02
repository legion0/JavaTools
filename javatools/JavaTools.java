package javatools;

import java.util.Arrays;

public class JavaTools {
	public static final Version VERSION = new Version("1.0.0");

	public static final void require(String version) {
		if (JavaTools.VERSION.compareTo(new Version(version)) < 0) {
			System.err.println("This program requires JavaTools Version " + version + ".");
			System.exit(-1);
		}
	}

	public static final class Version implements Comparable<Version> {
		private final int major, minor, sub;
		private final String stringRepr;

		public Version(String ver) {
			this.stringRepr = ver;
			String[] parts = ver.split("\\.");
			int major = 0;
			int minor = 0;
			int sub = 0;
			if (parts.length > 0) {
				major = Integer.parseInt(parts[0]);
				parts = Arrays.copyOfRange(parts, 1, parts.length);
			}
			if (parts.length > 0) {
				minor = Integer.parseInt(parts[0]);
				parts = Arrays.copyOfRange(parts, 1, parts.length);
			}
			if (parts.length > 0) {
				sub = Integer.parseInt(parts[0]);
				parts = Arrays.copyOfRange(parts, 1, parts.length);
			}
			this.major = major;
			this.minor = minor;
			this.sub = sub;
		}

		@Override
		public int compareTo(Version other) throws ClassCastException {
			int diff;
			diff = this.major - other.major;
			if (diff != 0) {
				return diff;
			}
			diff = this.minor - other.minor;
			if (diff != 0) {
				return diff;
			}
			diff = this.sub - other.sub;
			if (diff != 0) {
				return diff;
			}
			return 0;
		}

		@Override
		public String toString() {
			return stringRepr;
		}


	}
}
