.class public abstract Lud/e$a;
.super Lz3/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lud/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lz3/a<",
        "Landroid/graphics/drawable/Drawable;",
        ">;"
    }
.end annotation


# instance fields
.field private d:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lz3/a;-><init>()V

    return-void
.end method

.method private l(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Lud/e$a;->d:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;La4/b;)V
    .locals 0

    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1, p2}, Lud/e$a;->d(Landroid/graphics/drawable/Drawable;La4/b;)V

    return-void
.end method

.method public abstract c(Ljava/lang/Exception;)V
.end method

.method public d(Landroid/graphics/drawable/Drawable;La4/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/drawable/Drawable;",
            "La4/b<",
            "-",
            "Landroid/graphics/drawable/Drawable;",
            ">;)V"
        }
    .end annotation

    const-string p2, "Downloading Image Success!!!"

    invoke-static {p2}, Lud/m;->a(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lud/e$a;->l(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Lud/e$a;->k()V

    return-void
.end method

.method public g(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    const-string v0, "Downloading Image Cleared"

    invoke-static {v0}, Lud/m;->a(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lud/e$a;->l(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Lud/e$a;->k()V

    return-void
.end method

.method public j(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    const-string v0, "Downloading Image Failed"

    invoke-static {v0}, Lud/m;->a(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lud/e$a;->l(Landroid/graphics/drawable/Drawable;)V

    new-instance p1, Ljava/lang/Exception;

    const-string v0, "Image loading failed!"

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lud/e$a;->c(Ljava/lang/Exception;)V

    return-void
.end method

.method public abstract k()V
.end method

.method m(Landroid/widget/ImageView;)V
    .locals 0

    iput-object p1, p0, Lud/e$a;->d:Landroid/widget/ImageView;

    return-void
.end method
