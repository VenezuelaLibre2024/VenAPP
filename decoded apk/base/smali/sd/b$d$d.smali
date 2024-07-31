.class Lsd/b$d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


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

    iput-object p1, p0, Lsd/b$d$d;->a:Lsd/b$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lsd/b$d$d;->a:Lsd/b$d;

    iget-object v0, v0, Lsd/b$d;->s:Lsd/b;

    invoke-static {v0}, Lsd/b;->p(Lsd/b;)Lud/g;

    move-result-object v0

    iget-object v1, p0, Lsd/b$d$d;->a:Lsd/b$d;

    iget-object v2, v1, Lsd/b$d;->e:Lvd/c;

    iget-object v1, v1, Lsd/b$d;->f:Landroid/app/Activity;

    invoke-virtual {v0, v2, v1}, Lud/g;->i(Lvd/c;Landroid/app/Activity;)V

    iget-object v0, p0, Lsd/b$d$d;->a:Lsd/b$d;

    iget-object v0, v0, Lsd/b$d;->e:Lvd/c;

    invoke-virtual {v0}, Lvd/c;->b()Lud/l;

    move-result-object v0

    invoke-virtual {v0}, Lud/l;->n()Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lsd/b$d$d;->a:Lsd/b$d;

    iget-object v0, v0, Lsd/b$d;->s:Lsd/b;

    invoke-static {v0}, Lsd/b;->f(Lsd/b;)Lud/c;

    move-result-object v0

    iget-object v1, p0, Lsd/b$d$d;->a:Lsd/b$d;

    iget-object v1, v1, Lsd/b$d;->s:Lsd/b;

    invoke-static {v1}, Lsd/b;->d(Lsd/b;)Landroid/app/Application;

    move-result-object v1

    iget-object v2, p0, Lsd/b$d$d;->a:Lsd/b$d;

    iget-object v2, v2, Lsd/b$d;->e:Lvd/c;

    invoke-virtual {v2}, Lvd/c;->f()Landroid/view/ViewGroup;

    move-result-object v2

    sget-object v3, Lud/c$c;->TOP:Lud/c$c;

    invoke-virtual {v0, v1, v2, v3}, Lud/c;->a(Landroid/app/Application;Landroid/view/View;Lud/c$c;)V

    :cond_0
    return-void
.end method
