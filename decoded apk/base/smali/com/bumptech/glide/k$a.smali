.class Lcom/bumptech/glide/k$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/bumptech/glide/k;


# direct methods
.method constructor <init>(Lcom/bumptech/glide/k;)V
    .locals 0

    iput-object p1, p0, Lcom/bumptech/glide/k$a;->a:Lcom/bumptech/glide/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/bumptech/glide/k$a;->a:Lcom/bumptech/glide/k;

    iget-object v1, v0, Lcom/bumptech/glide/k;->c:Lcom/bumptech/glide/manager/l;

    invoke-interface {v1, v0}, Lcom/bumptech/glide/manager/l;->b(Lcom/bumptech/glide/manager/m;)V

    return-void
.end method