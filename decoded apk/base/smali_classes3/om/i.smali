.class public final Lom/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lom/j;


# instance fields
.field private final a:Lom/o;

.field private final b:Landroid/media/MediaPlayer;


# direct methods
.method public constructor <init>(Lom/o;)V
    .locals 1

    const-string v0, "wrappedPlayer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lom/i;->a:Lom/o;

    invoke-direct {p0, p1}, Lom/i;->o(Lom/o;)Landroid/media/MediaPlayer;

    move-result-object p1

    iput-object p1, p0, Lom/i;->b:Landroid/media/MediaPlayer;

    return-void
.end method

.method public static synthetic b(Lom/o;Landroid/media/MediaPlayer;II)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lom/i;->s(Lom/o;Landroid/media/MediaPlayer;II)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Lom/o;Landroid/media/MediaPlayer;)V
    .locals 0

    invoke-static {p0, p1}, Lom/i;->q(Lom/o;Landroid/media/MediaPlayer;)V

    return-void
.end method

.method public static synthetic d(Lom/o;Landroid/media/MediaPlayer;)V
    .locals 0

    invoke-static {p0, p1}, Lom/i;->r(Lom/o;Landroid/media/MediaPlayer;)V

    return-void
.end method

.method public static synthetic m(Lom/o;Landroid/media/MediaPlayer;)V
    .locals 0

    invoke-static {p0, p1}, Lom/i;->p(Lom/o;Landroid/media/MediaPlayer;)V

    return-void
.end method

.method public static synthetic n(Lom/o;Landroid/media/MediaPlayer;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lom/i;->t(Lom/o;Landroid/media/MediaPlayer;I)V

    return-void
.end method

.method private final o(Lom/o;)Landroid/media/MediaPlayer;
    .locals 2

    new-instance v0, Landroid/media/MediaPlayer;

    invoke-direct {v0}, Landroid/media/MediaPlayer;-><init>()V

    new-instance v1, Lom/d;

    invoke-direct {v1, p1}, Lom/d;-><init>(Lom/o;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnPreparedListener(Landroid/media/MediaPlayer$OnPreparedListener;)V

    new-instance v1, Lom/e;

    invoke-direct {v1, p1}, Lom/e;-><init>(Lom/o;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    new-instance v1, Lom/f;

    invoke-direct {v1, p1}, Lom/f;-><init>(Lom/o;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnSeekCompleteListener(Landroid/media/MediaPlayer$OnSeekCompleteListener;)V

    new-instance v1, Lom/g;

    invoke-direct {v1, p1}, Lom/g;-><init>(Lom/o;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    new-instance v1, Lom/h;

    invoke-direct {v1, p1}, Lom/h;-><init>(Lom/o;)V

    invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setOnBufferingUpdateListener(Landroid/media/MediaPlayer$OnBufferingUpdateListener;)V

    invoke-virtual {p1}, Lom/o;->h()Lnm/a;

    move-result-object p1

    invoke-virtual {p1, v0}, Lnm/a;->h(Landroid/media/MediaPlayer;)V

    return-object v0
.end method

.method private static final p(Lom/o;Landroid/media/MediaPlayer;)V
    .locals 0

    const-string p1, "$wrappedPlayer"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lom/o;->z()V

    return-void
.end method

.method private static final q(Lom/o;Landroid/media/MediaPlayer;)V
    .locals 0

    const-string p1, "$wrappedPlayer"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lom/o;->x()V

    return-void
.end method

.method private static final r(Lom/o;Landroid/media/MediaPlayer;)V
    .locals 0

    const-string p1, "$wrappedPlayer"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lom/o;->A()V

    return-void
.end method

.method private static final s(Lom/o;Landroid/media/MediaPlayer;II)Z
    .locals 0

    const-string p1, "$wrappedPlayer"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2, p3}, Lom/o;->y(II)Z

    move-result p0

    return p0
.end method

.method private static final t(Lom/o;Landroid/media/MediaPlayer;I)V
    .locals 0

    const-string p1, "$wrappedPlayer"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lom/o;->w(I)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lom/i;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->prepareAsync()V

    return-void
.end method

.method public e()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lom/i;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getCurrentPosition()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public f(Lnm/a;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lom/i;->b:Landroid/media/MediaPlayer;

    invoke-virtual {p1, v0}, Lnm/a;->h(Landroid/media/MediaPlayer;)V

    invoke-virtual {p1}, Lnm/a;->f()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lom/i;->b:Landroid/media/MediaPlayer;

    iget-object v0, p0, Lom/i;->a:Lom/o;

    invoke-virtual {v0}, Lom/o;->f()Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/media/MediaPlayer;->setWakeMode(Landroid/content/Context;I)V

    :cond_0
    return-void
.end method

.method public g(Lpm/b;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lom/i;->reset()V

    iget-object v0, p0, Lom/i;->b:Landroid/media/MediaPlayer;

    invoke-interface {p1, v0}, Lpm/b;->a(Landroid/media/MediaPlayer;)V

    return-void
.end method

.method public getDuration()Ljava/lang/Integer;
    .locals 3

    iget-object v0, p0, Lom/i;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getDuration()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method

.method public h(Z)V
    .locals 1

    iget-object v0, p0, Lom/i;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setLooping(Z)V

    return-void
.end method

.method public i()Z
    .locals 1

    iget-object v0, p0, Lom/i;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z

    move-result v0

    return v0
.end method

.method public j(FF)V
    .locals 1

    iget-object v0, p0, Lom/i;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1, p2}, Landroid/media/MediaPlayer;->setVolume(FF)V

    return-void
.end method

.method public k()Z
    .locals 1

    invoke-virtual {p0}, Lom/i;->getDuration()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public l(F)V
    .locals 2

    iget-object v0, p0, Lom/i;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->getPlaybackParams()Landroid/media/PlaybackParams;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/media/PlaybackParams;->setSpeed(F)Landroid/media/PlaybackParams;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->setPlaybackParams(Landroid/media/PlaybackParams;)V

    return-void
.end method

.method public pause()V
    .locals 1

    iget-object v0, p0, Lom/i;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V

    return-void
.end method

.method public release()V
    .locals 1

    iget-object v0, p0, Lom/i;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    iget-object v0, p0, Lom/i;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V

    return-void
.end method

.method public reset()V
    .locals 1

    iget-object v0, p0, Lom/i;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->reset()V

    return-void
.end method

.method public seekTo(I)V
    .locals 1

    iget-object v0, p0, Lom/i;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0, p1}, Landroid/media/MediaPlayer;->seekTo(I)V

    return-void
.end method

.method public start()V
    .locals 1

    iget-object v0, p0, Lom/i;->a:Lom/o;

    invoke-virtual {v0}, Lom/o;->o()F

    move-result v0

    invoke-virtual {p0, v0}, Lom/i;->l(F)V

    return-void
.end method

.method public stop()V
    .locals 1

    iget-object v0, p0, Lom/i;->b:Landroid/media/MediaPlayer;

    invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V

    return-void
.end method
