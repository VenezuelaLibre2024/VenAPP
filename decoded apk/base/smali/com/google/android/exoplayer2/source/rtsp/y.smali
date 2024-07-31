.class final Lcom/google/android/exoplayer2/source/rtsp/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Lcom/google/android/exoplayer2/source/rtsp/m;

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILcom/google/android/exoplayer2/source/rtsp/m;)V
    .locals 1

    const-string v0, ""

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/exoplayer2/source/rtsp/y;-><init>(ILcom/google/android/exoplayer2/source/rtsp/m;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(ILcom/google/android/exoplayer2/source/rtsp/m;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/exoplayer2/source/rtsp/y;->a:I

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/rtsp/y;->b:Lcom/google/android/exoplayer2/source/rtsp/m;

    iput-object p3, p0, Lcom/google/android/exoplayer2/source/rtsp/y;->c:Ljava/lang/String;

    return-void
.end method
