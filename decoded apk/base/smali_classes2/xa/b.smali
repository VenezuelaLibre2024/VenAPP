.class public Lxa/b;
.super Lea/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lxa/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lcom/google/android/gms/common/data/DataHolder;

.field private c:Landroid/os/ParcelFileDescriptor;

.field private d:J

.field private e:[B

.field private f:[B

.field private r:Ljava/io/File;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lxa/p;

    invoke-direct {v0}, Lxa/p;-><init>()V

    sput-object v0, Lxa/b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lxa/b;-><init>(Ljava/lang/String;Lcom/google/android/gms/common/data/DataHolder;Landroid/os/ParcelFileDescriptor;J[B)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/common/data/DataHolder;Landroid/os/ParcelFileDescriptor;J[B)V
    .locals 0

    invoke-direct {p0}, Lea/a;-><init>()V

    iput-object p1, p0, Lxa/b;->a:Ljava/lang/String;

    iput-object p2, p0, Lxa/b;->b:Lcom/google/android/gms/common/data/DataHolder;

    iput-object p3, p0, Lxa/b;->c:Landroid/os/ParcelFileDescriptor;

    iput-wide p4, p0, Lxa/b;->d:J

    iput-object p6, p0, Lxa/b;->e:[B

    return-void
.end method

.method private static final z1(Ljava/io/Closeable;)V
    .locals 0

    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method


# virtual methods
.method public u1()Landroid/os/ParcelFileDescriptor;
    .locals 1

    iget-object v0, p0, Lxa/b;->c:Landroid/os/ParcelFileDescriptor;

    return-object v0
.end method

.method public v1()J
    .locals 2

    iget-wide v0, p0, Lxa/b;->d:J

    return-wide v0
.end method

.method public w1()Lcom/google/android/gms/common/data/DataHolder;
    .locals 1

    iget-object v0, p0, Lxa/b;->b:Lcom/google/android/gms/common/data/DataHolder;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    iget-object v0, p0, Lxa/b;->c:Landroid/os/ParcelFileDescriptor;

    const/4 v1, 0x0

    if-nez v0, :cond_4

    iget-object v0, p0, Lxa/b;->f:[B

    if-eqz v0, :cond_4

    iget-object v0, p0, Lxa/b;->r:Ljava/io/File;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    move-object v2, v1

    goto :goto_2

    :cond_1
    :try_start_0
    const-string v2, "xlb"

    const-string v3, ".tmp"

    invoke-static {v2, v3, v0}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    const/high16 v3, 0x10000000

    invoke-static {v0, v3}, Landroid/os/ParcelFileDescriptor;->open(Ljava/io/File;I)Landroid/os/ParcelFileDescriptor;

    move-result-object v3

    iput-object v3, p0, Lxa/b;->c:Landroid/os/ParcelFileDescriptor;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    goto :goto_2

    :catchall_0
    move-exception p1

    move-object v1, v0

    goto :goto_1

    :catchall_1
    move-exception p1

    :goto_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    :cond_2
    throw p1

    :catch_0
    move-object v0, v1

    :catch_1
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    goto :goto_0

    :cond_3
    :goto_2
    if-eqz v2, :cond_4

    new-instance v0, Ljava/io/BufferedOutputStream;

    invoke-direct {v0, v2}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    new-instance v2, Ljava/io/DataOutputStream;

    invoke-direct {v2, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    :try_start_2
    iget-object v0, p0, Lxa/b;->f:[B

    array-length v0, v0

    invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeInt(I)V

    iget-object v0, p0, Lxa/b;->f:[B

    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-static {v2}, Lxa/b;->z1(Ljava/io/Closeable;)V

    or-int/lit8 p2, p2, 0x1

    goto :goto_3

    :catchall_2
    move-exception p1

    invoke-static {v2}, Lxa/b;->z1(Ljava/io/Closeable;)V

    throw p1

    :catch_2
    invoke-static {v2}, Lxa/b;->z1(Ljava/io/Closeable;)V

    :cond_4
    :goto_3
    invoke-static {p0, p1, p2}, Lxa/p;->a(Lxa/b;Landroid/os/Parcel;I)V

    iput-object v1, p0, Lxa/b;->c:Landroid/os/ParcelFileDescriptor;

    return-void
.end method

.method public x1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxa/b;->a:Ljava/lang/String;

    return-object v0
.end method

.method public y1()[B
    .locals 1

    iget-object v0, p0, Lxa/b;->e:[B

    return-object v0
.end method
