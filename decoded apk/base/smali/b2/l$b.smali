.class Lb2/l$b;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb2/l;->W(Landroid/animation/Animator;Landroidx/collection/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/collection/a;

.field final synthetic b:Lb2/l;


# direct methods
.method constructor <init>(Lb2/l;Landroidx/collection/a;)V
    .locals 0

    iput-object p1, p0, Lb2/l$b;->b:Lb2/l;

    iput-object p2, p0, Lb2/l$b;->a:Landroidx/collection/a;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, Lb2/l$b;->a:Landroidx/collection/a;

    invoke-virtual {v0, p1}, Landroidx/collection/h;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lb2/l$b;->b:Lb2/l;

    iget-object v0, v0, Lb2/l;->H:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    iget-object v0, p0, Lb2/l$b;->b:Lb2/l;

    iget-object v0, v0, Lb2/l;->H:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
