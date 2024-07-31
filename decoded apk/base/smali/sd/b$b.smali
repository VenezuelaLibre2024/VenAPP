.class Lsd/b$b;
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
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lsd/b;


# direct methods
.method constructor <init>(Lsd/b;Landroid/app/Activity;)V
    .locals 0

    iput-object p1, p0, Lsd/b$b;->b:Lsd/b;

    iput-object p2, p0, Lsd/b$b;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lsd/b$b;->b:Lsd/b;

    invoke-static {p1}, Lsd/b;->c(Lsd/b;)Lqd/t;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lsd/b$b;->b:Lsd/b;

    invoke-static {p1}, Lsd/b;->c(Lsd/b;)Lqd/t;

    move-result-object p1

    sget-object v0, Lqd/t$a;->CLICK:Lqd/t$a;

    invoke-interface {p1, v0}, Lqd/t;->b(Lqd/t$a;)Lcom/google/android/gms/tasks/Task;

    :cond_0
    iget-object p1, p0, Lsd/b$b;->b:Lsd/b;

    iget-object v0, p0, Lsd/b$b;->a:Landroid/app/Activity;

    invoke-static {p1, v0}, Lsd/b;->h(Lsd/b;Landroid/app/Activity;)V

    return-void
.end method
