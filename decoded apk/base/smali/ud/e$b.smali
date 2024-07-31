.class public Lud/e$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lud/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/bumptech/glide/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/j<",
            "Landroid/graphics/drawable/Drawable;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lud/e$a;

.field private c:Ljava/lang/String;

.field final synthetic d:Lud/e;


# direct methods
.method public constructor <init>(Lud/e;Lcom/bumptech/glide/j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/j<",
            "Landroid/graphics/drawable/Drawable;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lud/e$b;->d:Lud/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lud/e$b;->a:Lcom/bumptech/glide/j;

    return-void
.end method

.method private a()V
    .locals 4

    iget-object v0, p0, Lud/e$b;->b:Lud/e$a;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lud/e$b;->c:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lud/e$b;->d:Lud/e;

    invoke-static {v0}, Lud/e;->a(Lud/e;)Ljava/util/Map;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lud/e$b;->d:Lud/e;

    invoke-static {v1}, Lud/e;->a(Lud/e;)Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, Lud/e$b;->c:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lud/e$b;->d:Lud/e;

    invoke-static {v1}, Lud/e;->a(Lud/e;)Ljava/util/Map;

    move-result-object v1

    iget-object v2, p0, Lud/e$b;->c:Ljava/lang/String;

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Set;

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iget-object v2, p0, Lud/e$b;->d:Lud/e;

    invoke-static {v2}, Lud/e;->a(Lud/e;)Ljava/util/Map;

    move-result-object v2

    iget-object v3, p0, Lud/e$b;->c:Ljava/lang/String;

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    iget-object v2, p0, Lud/e$b;->b:Lud/e$a;

    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lud/e$b;->b:Lud/e$a;

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public b(Landroid/widget/ImageView;Lud/e$a;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Downloading Image Callback : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lud/m;->a(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lud/e$a;->m(Landroid/widget/ImageView;)V

    iget-object p1, p0, Lud/e$b;->a:Lcom/bumptech/glide/j;

    invoke-virtual {p1, p2}, Lcom/bumptech/glide/j;->o0(Lz3/d;)Lz3/d;

    iput-object p2, p0, Lud/e$b;->b:Lud/e$a;

    invoke-direct {p0}, Lud/e$b;->a()V

    return-void
.end method

.method public c(I)Lud/e$b;
    .locals 2

    iget-object v0, p0, Lud/e$b;->a:Lcom/bumptech/glide/j;

    invoke-virtual {v0, p1}, Ly3/a;->O(I)Ly3/a;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Downloading Image Placeholder : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lud/m;->a(Ljava/lang/String;)V

    return-object p0
.end method

.method public d(Ljava/lang/Class;)Lud/e$b;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lud/e$b;->c:Ljava/lang/String;

    invoke-direct {p0}, Lud/e$b;->a()V

    return-object p0
.end method
