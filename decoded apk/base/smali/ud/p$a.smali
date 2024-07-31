.class Lud/p$a;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lud/p;->k(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lud/p;


# direct methods
.method constructor <init>(Lud/p;)V
    .locals 0

    iput-object p1, p0, Lud/p$a;->a:Lud/p;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    iget-object p1, p0, Lud/p$a;->a:Lud/p;

    invoke-static {p1}, Lud/p;->a(Lud/p;)V

    return-void
.end method
