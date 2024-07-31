.class final Lcom/google/android/exoplayer2/source/rtsp/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/exoplayer2/source/rtsp/s$e;,
        Lcom/google/android/exoplayer2/source/rtsp/s$c;,
        Lcom/google/android/exoplayer2/source/rtsp/s$f;,
        Lcom/google/android/exoplayer2/source/rtsp/s$g;,
        Lcom/google/android/exoplayer2/source/rtsp/s$b;,
        Lcom/google/android/exoplayer2/source/rtsp/s$d;
    }
.end annotation


# static fields
.field public static final r:Ljava/nio/charset/Charset;


# instance fields
.field private final a:Lcom/google/android/exoplayer2/source/rtsp/s$d;

.field private final b:Ls8/e0;

.field private final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/google/android/exoplayer2/source/rtsp/s$b;",
            ">;"
        }
    .end annotation
.end field

.field private d:Lcom/google/android/exoplayer2/source/rtsp/s$g;

.field private e:Ljava/net/Socket;

.field private volatile f:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Leb/e;->c:Ljava/nio/charset/Charset;

    sput-object v0, Lcom/google/android/exoplayer2/source/rtsp/s;->r:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/exoplayer2/source/rtsp/s$d;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/rtsp/s;->a:Lcom/google/android/exoplayer2/source/rtsp/s$d;

    new-instance p1, Ls8/e0;

    const-string v0, "ExoPlayer:RtspMessageChannel:ReceiverLoader"

    invoke-direct {p1, v0}, Ls8/e0;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/rtsp/s;->b:Ls8/e0;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/rtsp/s;->c:Ljava/util/Map;

    return-void
.end method

.method static synthetic a(Lcom/google/android/exoplayer2/source/rtsp/s;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/exoplayer2/source/rtsp/s;->f:Z

    return p0
.end method

.method static synthetic b(Lcom/google/android/exoplayer2/source/rtsp/s;)Lcom/google/android/exoplayer2/source/rtsp/s$d;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/source/rtsp/s;->a:Lcom/google/android/exoplayer2/source/rtsp/s$d;

    return-object p0
.end method

.method static synthetic e(Lcom/google/android/exoplayer2/source/rtsp/s;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/source/rtsp/s;->c:Ljava/util/Map;

    return-object p0
.end method


# virtual methods
.method public close()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/source/rtsp/s;->f:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    :try_start_0
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/rtsp/s;->d:Lcom/google/android/exoplayer2/source/rtsp/s$g;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/google/android/exoplayer2/source/rtsp/s$g;->close()V

    :cond_1
    iget-object v1, p0, Lcom/google/android/exoplayer2/source/rtsp/s;->b:Ls8/e0;

    invoke-virtual {v1}, Ls8/e0;->l()V

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/rtsp/s;->e:Ljava/net/Socket;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/net/Socket;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    iput-boolean v0, p0, Lcom/google/android/exoplayer2/source/rtsp/s;->f:Z

    return-void

    :catchall_0
    move-exception v1

    iput-boolean v0, p0, Lcom/google/android/exoplayer2/source/rtsp/s;->f:Z

    throw v1
.end method

.method public f(Ljava/net/Socket;)V
    .locals 3

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/rtsp/s;->e:Ljava/net/Socket;

    new-instance v0, Lcom/google/android/exoplayer2/source/rtsp/s$g;

    invoke-virtual {p1}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/google/android/exoplayer2/source/rtsp/s$g;-><init>(Lcom/google/android/exoplayer2/source/rtsp/s;Ljava/io/OutputStream;)V

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/s;->d:Lcom/google/android/exoplayer2/source/rtsp/s$g;

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/s;->b:Ls8/e0;

    new-instance v1, Lcom/google/android/exoplayer2/source/rtsp/s$f;

    invoke-virtual {p1}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    invoke-direct {v1, p0, p1}, Lcom/google/android/exoplayer2/source/rtsp/s$f;-><init>(Lcom/google/android/exoplayer2/source/rtsp/s;Ljava/io/InputStream;)V

    new-instance p1, Lcom/google/android/exoplayer2/source/rtsp/s$c;

    const/4 v2, 0x0

    invoke-direct {p1, p0, v2}, Lcom/google/android/exoplayer2/source/rtsp/s$c;-><init>(Lcom/google/android/exoplayer2/source/rtsp/s;Lcom/google/android/exoplayer2/source/rtsp/s$a;)V

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Ls8/e0;->n(Ls8/e0$e;Ls8/e0$b;I)J

    return-void
.end method

.method public g(ILcom/google/android/exoplayer2/source/rtsp/s$b;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/s;->c:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public i(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/s;->d:Lcom/google/android/exoplayer2/source/rtsp/s$g;

    invoke-static {v0}, Lt8/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/s;->d:Lcom/google/android/exoplayer2/source/rtsp/s$g;

    invoke-virtual {v0, p1}, Lcom/google/android/exoplayer2/source/rtsp/s$g;->e(Ljava/util/List;)V

    return-void
.end method
