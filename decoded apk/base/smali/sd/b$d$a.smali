.class Lsd/b$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


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

    iput-object p1, p0, Lsd/b$d$a;->a:Lsd/b$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 p2, 0x4

    if-ne p1, p2, :cond_1

    iget-object p1, p0, Lsd/b$d$a;->a:Lsd/b$d;

    iget-object p1, p1, Lsd/b$d;->s:Lsd/b;

    invoke-static {p1}, Lsd/b;->c(Lsd/b;)Lqd/t;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lsd/b$d$a;->a:Lsd/b$d;

    iget-object p1, p1, Lsd/b$d;->s:Lsd/b;

    invoke-static {p1}, Lsd/b;->c(Lsd/b;)Lqd/t;

    move-result-object p1

    sget-object p2, Lqd/t$a;->UNKNOWN_DISMISS_TYPE:Lqd/t$a;

    invoke-interface {p1, p2}, Lqd/t;->b(Lqd/t$a;)Lcom/google/android/gms/tasks/Task;

    :cond_0
    iget-object p1, p0, Lsd/b$d$a;->a:Lsd/b$d;

    iget-object p2, p1, Lsd/b$d;->s:Lsd/b;

    iget-object p1, p1, Lsd/b$d;->f:Landroid/app/Activity;

    invoke-static {p2, p1}, Lsd/b;->h(Lsd/b;Landroid/app/Activity;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
