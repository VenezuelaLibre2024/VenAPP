.class Lc1/f$c;
.super Lc1/f$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc1/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "c"
.end annotation


# instance fields
.field private final a:Lc1/f$a;


# direct methods
.method constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    invoke-direct {p0}, Lc1/f$b;-><init>()V

    new-instance v0, Lc1/f$a;

    invoke-direct {v0, p1}, Lc1/f$a;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Lc1/f$c;->a:Lc1/f$a;

    return-void
.end method

.method private d()Z
    .locals 1

    invoke-static {}, Landroidx/emoji2/text/e;->h()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method


# virtual methods
.method a([Landroid/text/InputFilter;)[Landroid/text/InputFilter;
    .locals 1

    invoke-direct {p0}, Lc1/f$c;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, Lc1/f$c;->a:Lc1/f$a;

    invoke-virtual {v0, p1}, Lc1/f$a;->a([Landroid/text/InputFilter;)[Landroid/text/InputFilter;

    move-result-object p1

    return-object p1
.end method

.method b(Z)V
    .locals 1

    invoke-direct {p0}, Lc1/f$c;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lc1/f$c;->a:Lc1/f$a;

    invoke-virtual {v0, p1}, Lc1/f$a;->b(Z)V

    return-void
.end method

.method c(Z)V
    .locals 1

    invoke-direct {p0}, Lc1/f$c;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lc1/f$c;->a:Lc1/f$a;

    invoke-virtual {v0, p1}, Lc1/f$a;->g(Z)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lc1/f$c;->a:Lc1/f$a;

    invoke-virtual {v0, p1}, Lc1/f$a;->c(Z)V

    :goto_0
    return-void
.end method
