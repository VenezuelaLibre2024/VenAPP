.class Lcom/google/android/exoplayer2/source/rtsp/RtspMediaSource$b;
.super Lv7/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/exoplayer2/source/rtsp/RtspMediaSource;->K()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>(Lcom/google/android/exoplayer2/source/rtsp/RtspMediaSource;Lt6/d4;)V
    .locals 0

    invoke-direct {p0, p2}, Lv7/s;-><init>(Lt6/d4;)V

    return-void
.end method


# virtual methods
.method public l(ILt6/d4$b;Z)Lt6/d4$b;
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lv7/s;->l(ILt6/d4$b;Z)Lt6/d4$b;

    const/4 p1, 0x1

    iput-boolean p1, p2, Lt6/d4$b;->f:Z

    return-object p2
.end method

.method public t(ILt6/d4$d;J)Lt6/d4$d;
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Lv7/s;->t(ILt6/d4$d;J)Lt6/d4$d;

    const/4 p1, 0x1

    iput-boolean p1, p2, Lt6/d4$d;->w:Z

    return-object p2
.end method
