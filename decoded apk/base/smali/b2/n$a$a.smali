.class Lb2/n$a$a;
.super Lb2/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb2/n$a;->onPreDraw()Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/collection/a;

.field final synthetic b:Lb2/n$a;


# direct methods
.method constructor <init>(Lb2/n$a;Landroidx/collection/a;)V
    .locals 0

    iput-object p1, p0, Lb2/n$a$a;->b:Lb2/n$a;

    iput-object p2, p0, Lb2/n$a$a;->a:Landroidx/collection/a;

    invoke-direct {p0}, Lb2/m;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Lb2/l;)V
    .locals 2

    iget-object v0, p0, Lb2/n$a$a;->a:Landroidx/collection/a;

    iget-object v1, p0, Lb2/n$a$a;->b:Lb2/n$a;

    iget-object v1, v1, Lb2/n$a;->b:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroidx/collection/h;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p1, p0}, Lb2/l;->T(Lb2/l$f;)Lb2/l;

    return-void
.end method
