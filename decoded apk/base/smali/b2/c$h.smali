.class Lb2/c$h;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb2/c;->p(Landroid/view/ViewGroup;Lb2/s;Lb2/s;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb2/c$k;

.field final synthetic b:Lb2/c;

.field private mViewBounds:Lb2/c$k;


# direct methods
.method constructor <init>(Lb2/c;Lb2/c$k;)V
    .locals 0

    iput-object p1, p0, Lb2/c$h;->b:Lb2/c;

    iput-object p2, p0, Lb2/c$h;->a:Lb2/c$k;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    iput-object p2, p0, Lb2/c$h;->mViewBounds:Lb2/c$k;

    return-void
.end method
