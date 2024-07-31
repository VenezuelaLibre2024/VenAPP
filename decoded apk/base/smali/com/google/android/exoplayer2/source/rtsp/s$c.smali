.class final Lcom/google/android/exoplayer2/source/rtsp/s$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls8/e0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/source/rtsp/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ls8/e0$b<",
        "Lcom/google/android/exoplayer2/source/rtsp/s$f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/exoplayer2/source/rtsp/s;


# direct methods
.method private constructor <init>(Lcom/google/android/exoplayer2/source/rtsp/s;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/rtsp/s$c;->a:Lcom/google/android/exoplayer2/source/rtsp/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/exoplayer2/source/rtsp/s;Lcom/google/android/exoplayer2/source/rtsp/s$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/exoplayer2/source/rtsp/s$c;-><init>(Lcom/google/android/exoplayer2/source/rtsp/s;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/exoplayer2/source/rtsp/s$f;JJZ)V
    .locals 0

    return-void
.end method

.method public b(Lcom/google/android/exoplayer2/source/rtsp/s$f;JJ)V
    .locals 0

    return-void
.end method

.method public c(Lcom/google/android/exoplayer2/source/rtsp/s$f;JJLjava/io/IOException;I)Ls8/e0$c;
    .locals 0

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/rtsp/s$c;->a:Lcom/google/android/exoplayer2/source/rtsp/s;

    invoke-static {p1}, Lcom/google/android/exoplayer2/source/rtsp/s;->a(Lcom/google/android/exoplayer2/source/rtsp/s;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/rtsp/s$c;->a:Lcom/google/android/exoplayer2/source/rtsp/s;

    invoke-static {p1}, Lcom/google/android/exoplayer2/source/rtsp/s;->b(Lcom/google/android/exoplayer2/source/rtsp/s;)Lcom/google/android/exoplayer2/source/rtsp/s$d;

    move-result-object p1

    invoke-interface {p1, p6}, Lcom/google/android/exoplayer2/source/rtsp/s$d;->a(Ljava/lang/Exception;)V

    :cond_0
    sget-object p1, Ls8/e0;->f:Ls8/e0$c;

    return-object p1
.end method

.method public bridge synthetic h(Ls8/e0$e;JJLjava/io/IOException;I)Ls8/e0$c;
    .locals 0

    check-cast p1, Lcom/google/android/exoplayer2/source/rtsp/s$f;

    invoke-virtual/range {p0 .. p7}, Lcom/google/android/exoplayer2/source/rtsp/s$c;->c(Lcom/google/android/exoplayer2/source/rtsp/s$f;JJLjava/io/IOException;I)Ls8/e0$c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic i(Ls8/e0$e;JJZ)V
    .locals 0

    check-cast p1, Lcom/google/android/exoplayer2/source/rtsp/s$f;

    invoke-virtual/range {p0 .. p6}, Lcom/google/android/exoplayer2/source/rtsp/s$c;->a(Lcom/google/android/exoplayer2/source/rtsp/s$f;JJZ)V

    return-void
.end method

.method public bridge synthetic m(Ls8/e0$e;JJ)V
    .locals 0

    check-cast p1, Lcom/google/android/exoplayer2/source/rtsp/s$f;

    invoke-virtual/range {p0 .. p5}, Lcom/google/android/exoplayer2/source/rtsp/s$c;->b(Lcom/google/android/exoplayer2/source/rtsp/s$f;JJ)V

    return-void
.end method
