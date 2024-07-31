.class public final Lom/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lom/o;

.field private b:Landroid/media/AudioManager$OnAudioFocusChangeListener;

.field private c:Landroid/media/AudioFocusRequest;


# direct methods
.method public constructor <init>(Lom/o;)V
    .locals 1

    const-string v0, "player"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lom/c;->a:Lom/o;

    return-void
.end method

.method public static synthetic a(Lom/c;Lok/a;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lom/c;->i(Lom/c;Lok/a;I)V

    return-void
.end method

.method public static synthetic b(Lom/c;Lok/a;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lom/c;->k(Lom/c;Lok/a;I)V

    return-void
.end method

.method private final c()Landroid/media/AudioManager;
    .locals 1

    iget-object v0, p0, Lom/c;->a:Lom/o;

    invoke-virtual {v0}, Lom/o;->g()Landroid/media/AudioManager;

    move-result-object v0

    return-object v0
.end method

.method private final d()Lnm/a;
    .locals 1

    iget-object v0, p0, Lom/c;->a:Lom/o;

    invoke-virtual {v0}, Lom/o;->h()Lnm/a;

    move-result-object v0

    return-object v0
.end method

.method private final e(ILok/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lok/a<",
            "Lck/v;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    invoke-interface {p2}, Lok/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private final h(Lok/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lok/a<",
            "Lck/v;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lom/c;->d()Lnm/a;

    move-result-object v0

    invoke-virtual {v0}, Lnm/a;->d()I

    move-result v0

    new-instance v1, Landroid/media/AudioFocusRequest$Builder;

    invoke-direct {v1, v0}, Landroid/media/AudioFocusRequest$Builder;-><init>(I)V

    invoke-direct {p0}, Lom/c;->d()Lnm/a;

    move-result-object v0

    invoke-virtual {v0}, Lnm/a;->a()Landroid/media/AudioAttributes;

    move-result-object v0

    invoke-static {v1, v0}, Lt6/d;->a(Landroid/media/AudioFocusRequest$Builder;Landroid/media/AudioAttributes;)Landroid/media/AudioFocusRequest$Builder;

    move-result-object v0

    new-instance v1, Lom/a;

    invoke-direct {v1, p0, p1}, Lom/a;-><init>(Lom/c;Lok/a;)V

    invoke-static {v0, v1}, Lt6/f;->a(Landroid/media/AudioFocusRequest$Builder;Landroid/media/AudioManager$OnAudioFocusChangeListener;)Landroid/media/AudioFocusRequest$Builder;

    move-result-object v0

    invoke-static {v0}, Lt6/g;->a(Landroid/media/AudioFocusRequest$Builder;)Landroid/media/AudioFocusRequest;

    move-result-object v0

    iput-object v0, p0, Lom/c;->c:Landroid/media/AudioFocusRequest;

    invoke-direct {p0}, Lom/c;->c()Landroid/media/AudioManager;

    move-result-object v1

    invoke-static {v1, v0}, Lt6/h;->a(Landroid/media/AudioManager;Landroid/media/AudioFocusRequest;)I

    move-result v0

    invoke-direct {p0, v0, p1}, Lom/c;->e(ILok/a;)V

    return-void
.end method

.method private static final i(Lom/c;Lok/a;I)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$andThen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p1}, Lom/c;->e(ILok/a;)V

    return-void
.end method

.method private final j(Lok/a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lok/a<",
            "Lck/v;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lom/c;->d()Lnm/a;

    move-result-object v0

    invoke-virtual {v0}, Lnm/a;->d()I

    move-result v0

    new-instance v1, Lom/b;

    invoke-direct {v1, p0, p1}, Lom/b;-><init>(Lom/c;Lok/a;)V

    iput-object v1, p0, Lom/c;->b:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    invoke-direct {p0}, Lom/c;->c()Landroid/media/AudioManager;

    move-result-object v1

    iget-object v2, p0, Lom/c;->b:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    const/4 v3, 0x3

    invoke-virtual {v1, v2, v3, v0}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    move-result v0

    invoke-direct {p0, v0, p1}, Lom/c;->e(ILok/a;)V

    return-void
.end method

.method private static final k(Lom/c;Lok/a;I)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$andThen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p1}, Lom/c;->e(ILok/a;)V

    return-void
.end method


# virtual methods
.method public final f()V
    .locals 2

    invoke-direct {p0}, Lom/c;->d()Lnm/a;

    move-result-object v0

    invoke-virtual {v0}, Lnm/a;->d()I

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lom/c;->c:Landroid/media/AudioFocusRequest;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lom/c;->c()Landroid/media/AudioManager;

    move-result-object v1

    invoke-static {v1, v0}, Lt6/c;->a(Landroid/media/AudioManager;Landroid/media/AudioFocusRequest;)I

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lom/c;->c()Landroid/media/AudioManager;

    move-result-object v0

    iget-object v1, p0, Lom/c;->b:Landroid/media/AudioManager$OnAudioFocusChangeListener;

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    :cond_1
    :goto_0
    return-void
.end method

.method public final g(Lok/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lok/a<",
            "Lck/v;",
            ">;)V"
        }
    .end annotation

    const-string v0, "andThen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lom/c;->d()Lnm/a;

    move-result-object v0

    invoke-virtual {v0}, Lnm/a;->d()I

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, Lok/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    invoke-direct {p0, p1}, Lom/c;->h(Lok/a;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1}, Lom/c;->j(Lok/a;)V

    :goto_0
    return-void
.end method
