.class Landroidx/fragment/app/Fragment$g;
.super Landroidx/fragment/app/Fragment$k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/fragment/app/Fragment;->prepareCallInternal(Lf/a;Lm/a;Landroidx/activity/result/b;)Landroidx/activity/result/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lm/a;

.field final synthetic b:Ljava/util/concurrent/atomic/AtomicReference;

.field final synthetic c:Lf/a;

.field final synthetic d:Landroidx/activity/result/b;

.field final synthetic e:Landroidx/fragment/app/Fragment;


# direct methods
.method constructor <init>(Landroidx/fragment/app/Fragment;Lm/a;Ljava/util/concurrent/atomic/AtomicReference;Lf/a;Landroidx/activity/result/b;)V
    .locals 0

    iput-object p1, p0, Landroidx/fragment/app/Fragment$g;->e:Landroidx/fragment/app/Fragment;

    iput-object p2, p0, Landroidx/fragment/app/Fragment$g;->a:Lm/a;

    iput-object p3, p0, Landroidx/fragment/app/Fragment$g;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p4, p0, Landroidx/fragment/app/Fragment$g;->c:Lf/a;

    iput-object p5, p0, Landroidx/fragment/app/Fragment$g;->d:Landroidx/activity/result/b;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Landroidx/fragment/app/Fragment$k;-><init>(Landroidx/fragment/app/Fragment$a;)V

    return-void
.end method


# virtual methods
.method a()V
    .locals 6

    iget-object v0, p0, Landroidx/fragment/app/Fragment$g;->e:Landroidx/fragment/app/Fragment;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->generateActivityResultKey()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Landroidx/fragment/app/Fragment$g;->a:Lm/a;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Lm/a;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/activity/result/ActivityResultRegistry;

    iget-object v2, p0, Landroidx/fragment/app/Fragment$g;->b:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v3, p0, Landroidx/fragment/app/Fragment$g;->e:Landroidx/fragment/app/Fragment;

    iget-object v4, p0, Landroidx/fragment/app/Fragment$g;->c:Lf/a;

    iget-object v5, p0, Landroidx/fragment/app/Fragment$g;->d:Landroidx/activity/result/b;

    invoke-virtual {v1, v0, v3, v4, v5}, Landroidx/activity/result/ActivityResultRegistry;->i(Ljava/lang/String;Landroidx/lifecycle/k;Lf/a;Landroidx/activity/result/b;)Landroidx/activity/result/c;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method
