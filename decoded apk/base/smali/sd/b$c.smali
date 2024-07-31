.class Lsd/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsd/b;->w(Landroid/app/Activity;Lvd/c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lde/a;

.field final synthetic b:Landroid/app/Activity;

.field final synthetic c:Lsd/b;


# direct methods
.method constructor <init>(Lsd/b;Lde/a;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lsd/b$c;->c:Lsd/b;

    iput-object p2, p0, Lsd/b$c;->a:Lde/a;

    iput-object p3, p0, Lsd/b$c;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lsd/b$c;->c:Lsd/b;

    invoke-static {p1}, Lsd/b;->c(Lsd/b;)Lqd/t;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string p1, "Calling callback for click action"

    invoke-static {p1}, Lud/m;->f(Ljava/lang/String;)V

    iget-object p1, p0, Lsd/b$c;->c:Lsd/b;

    invoke-static {p1}, Lsd/b;->c(Lsd/b;)Lqd/t;

    move-result-object p1

    iget-object v0, p0, Lsd/b$c;->a:Lde/a;

    invoke-interface {p1, v0}, Lqd/t;->a(Lde/a;)Lcom/google/android/gms/tasks/Task;

    :cond_0
    iget-object p1, p0, Lsd/b$c;->c:Lsd/b;

    iget-object v0, p0, Lsd/b$c;->b:Landroid/app/Activity;

    iget-object v1, p0, Lsd/b$c;->a:Lde/a;

    invoke-virtual {v1}, Lde/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lsd/b;->i(Lsd/b;Landroid/app/Activity;Landroid/net/Uri;)V

    iget-object p1, p0, Lsd/b$c;->c:Lsd/b;

    invoke-static {p1}, Lsd/b;->j(Lsd/b;)V

    iget-object p1, p0, Lsd/b$c;->c:Lsd/b;

    iget-object v0, p0, Lsd/b$c;->b:Landroid/app/Activity;

    invoke-static {p1, v0}, Lsd/b;->k(Lsd/b;Landroid/app/Activity;)V

    iget-object p1, p0, Lsd/b$c;->c:Lsd/b;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lsd/b;->m(Lsd/b;Lde/i;)Lde/i;

    iget-object p1, p0, Lsd/b$c;->c:Lsd/b;

    invoke-static {p1, v0}, Lsd/b;->e(Lsd/b;Lqd/t;)Lqd/t;

    return-void
.end method
