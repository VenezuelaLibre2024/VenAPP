.class final Lcom/bumptech/glide/manager/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/bumptech/glide/manager/c;


# instance fields
.field private final a:Landroid/content/Context;

.field final b:Lcom/bumptech/glide/manager/c$a;


# direct methods
.method constructor <init>(Landroid/content/Context;Lcom/bumptech/glide/manager/c$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/bumptech/glide/manager/e;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/bumptech/glide/manager/e;->b:Lcom/bumptech/glide/manager/c$a;

    return-void
.end method

.method private c()V
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/manager/e;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/bumptech/glide/manager/t;->a(Landroid/content/Context;)Lcom/bumptech/glide/manager/t;

    move-result-object v0

    iget-object v1, p0, Lcom/bumptech/glide/manager/e;->b:Lcom/bumptech/glide/manager/c$a;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/manager/t;->d(Lcom/bumptech/glide/manager/c$a;)V

    return-void
.end method

.method private d()V
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/manager/e;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/bumptech/glide/manager/t;->a(Landroid/content/Context;)Lcom/bumptech/glide/manager/t;

    move-result-object v0

    iget-object v1, p0, Lcom/bumptech/glide/manager/e;->b:Lcom/bumptech/glide/manager/c$a;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/manager/t;->e(Lcom/bumptech/glide/manager/c$a;)V

    return-void
.end method


# virtual methods
.method public onDestroy()V
    .locals 0

    return-void
.end method

.method public onStart()V
    .locals 0

    invoke-direct {p0}, Lcom/bumptech/glide/manager/e;->c()V

    return-void
.end method

.method public onStop()V
    .locals 0

    invoke-direct {p0}, Lcom/bumptech/glide/manager/e;->d()V

    return-void
.end method
