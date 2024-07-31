.class Landroidx/appcompat/widget/y$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/appcompat/widget/y$h;-><init>(Landroidx/appcompat/widget/y;Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/appcompat/widget/y;

.field final synthetic b:Landroidx/appcompat/widget/y$h;


# direct methods
.method constructor <init>(Landroidx/appcompat/widget/y$h;Landroidx/appcompat/widget/y;)V
    .locals 0

    iput-object p1, p0, Landroidx/appcompat/widget/y$h$a;->b:Landroidx/appcompat/widget/y$h;

    iput-object p2, p0, Landroidx/appcompat/widget/y$h$a;->a:Landroidx/appcompat/widget/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    iget-object p1, p0, Landroidx/appcompat/widget/y$h$a;->b:Landroidx/appcompat/widget/y$h;

    iget-object p1, p1, Landroidx/appcompat/widget/y$h;->X:Landroidx/appcompat/widget/y;

    invoke-virtual {p1, p3}, Landroid/widget/AdapterView;->setSelection(I)V

    iget-object p1, p0, Landroidx/appcompat/widget/y$h$a;->b:Landroidx/appcompat/widget/y$h;

    iget-object p1, p1, Landroidx/appcompat/widget/y$h;->X:Landroidx/appcompat/widget/y;

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getOnItemClickListener()Landroid/widget/AdapterView$OnItemClickListener;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/appcompat/widget/y$h$a;->b:Landroidx/appcompat/widget/y$h;

    iget-object p4, p1, Landroidx/appcompat/widget/y$h;->X:Landroidx/appcompat/widget/y;

    iget-object p1, p1, Landroidx/appcompat/widget/y$h;->U:Landroid/widget/ListAdapter;

    invoke-interface {p1, p3}, Landroid/widget/Adapter;->getItemId(I)J

    move-result-wide v0

    invoke-virtual {p4, p2, p3, v0, v1}, Landroid/widget/AdapterView;->performItemClick(Landroid/view/View;IJ)Z

    :cond_0
    iget-object p1, p0, Landroidx/appcompat/widget/y$h$a;->b:Landroidx/appcompat/widget/y$h;

    invoke-virtual {p1}, Landroidx/appcompat/widget/u0;->dismiss()V

    return-void
.end method
