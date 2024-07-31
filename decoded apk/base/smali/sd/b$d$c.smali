.class Lsd/b$d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud/n$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsd/b$d;->k()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lsd/b$d;


# direct methods
.method constructor <init>(Lsd/b$d;)V
    .locals 0

    iput-object p1, p0, Lsd/b$d$c;->a:Lsd/b$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lsd/b$d$c;->a:Lsd/b$d;

    iget-object v0, v0, Lsd/b$d;->s:Lsd/b;

    invoke-static {v0}, Lsd/b;->l(Lsd/b;)Lde/i;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lsd/b$d$c;->a:Lsd/b$d;

    iget-object v0, v0, Lsd/b$d;->s:Lsd/b;

    invoke-static {v0}, Lsd/b;->c(Lsd/b;)Lqd/t;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lsd/b$d$c;->a:Lsd/b$d;

    iget-object v0, v0, Lsd/b$d;->s:Lsd/b;

    invoke-static {v0}, Lsd/b;->c(Lsd/b;)Lqd/t;

    move-result-object v0

    sget-object v1, Lqd/t$a;->AUTO:Lqd/t$a;

    invoke-interface {v0, v1}, Lqd/t;->b(Lqd/t$a;)Lcom/google/android/gms/tasks/Task;

    :cond_0
    iget-object v0, p0, Lsd/b$d$c;->a:Lsd/b$d;

    iget-object v1, v0, Lsd/b$d;->s:Lsd/b;

    iget-object v0, v0, Lsd/b$d;->f:Landroid/app/Activity;

    invoke-static {v1, v0}, Lsd/b;->h(Lsd/b;Landroid/app/Activity;)V

    return-void
.end method
