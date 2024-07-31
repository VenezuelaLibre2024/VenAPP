.class public final Lc1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc1/f$a;,
        Lc1/f$c;,
        Lc1/f$b;
    }
.end annotation


# instance fields
.field private final a:Lc1/f$b;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "textView cannot be null"

    invoke-static {p1, v0}, Landroidx/core/util/h;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-nez p2, :cond_0

    new-instance p2, Lc1/f$c;

    invoke-direct {p2, p1}, Lc1/f$c;-><init>(Landroid/widget/TextView;)V

    goto :goto_0

    :cond_0
    new-instance p2, Lc1/f$a;

    invoke-direct {p2, p1}, Lc1/f$a;-><init>(Landroid/widget/TextView;)V

    :goto_0
    iput-object p2, p0, Lc1/f;->a:Lc1/f$b;

    return-void
.end method


# virtual methods
.method public a([Landroid/text/InputFilter;)[Landroid/text/InputFilter;
    .locals 1

    iget-object v0, p0, Lc1/f;->a:Lc1/f$b;

    invoke-virtual {v0, p1}, Lc1/f$b;->a([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    return-object p1
.end method

.method public b(Z)V
    .locals 1

    iget-object v0, p0, Lc1/f;->a:Lc1/f$b;

    invoke-virtual {v0, p1}, Lc1/f$b;->b(Z)V

    return-void
.end method

.method public c(Z)V
    .locals 1

    iget-object v0, p0, Lc1/f;->a:Lc1/f$b;

    invoke-virtual {v0, p1}, Lc1/f$b;->c(Z)V

    return-void
.end method
