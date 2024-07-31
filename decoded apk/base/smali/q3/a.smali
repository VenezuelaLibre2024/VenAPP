.class public Lq3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh3/j;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<DataType:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lh3/j<",
        "TDataType;",
        "Landroid/graphics/drawable/BitmapDrawable;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lh3/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh3/j<",
            "TDataType;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;Lh3/j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/res/Resources;",
            "Lh3/j<",
            "TDataType;",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lc4/k;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/res/Resources;

    iput-object p1, p0, Lq3/a;->b:Landroid/content/res/Resources;

    invoke-static {p2}, Lc4/k;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh3/j;

    iput-object p1, p0, Lq3/a;->a:Lh3/j;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lh3/h;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TDataType;",
            "Lh3/h;",
            ")Z"
        }
    .end annotation

    iget-object v0, p0, Lq3/a;->a:Lh3/j;

    invoke-interface {v0, p1, p2}, Lh3/j;->a(Ljava/lang/Object;Lh3/h;)Z

    move-result p1

    return p1
.end method

.method public b(Ljava/lang/Object;IILh3/h;)Lj3/v;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TDataType;II",
            "Lh3/h;",
            ")",
            "Lj3/v<",
            "Landroid/graphics/drawable/BitmapDrawable;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lq3/a;->a:Lh3/j;

    invoke-interface {v0, p1, p2, p3, p4}, Lh3/j;->b(Ljava/lang/Object;IILh3/h;)Lj3/v;

    move-result-object p1

    iget-object p2, p0, Lq3/a;->b:Landroid/content/res/Resources;

    invoke-static {p2, p1}, Lq3/x;->b(Landroid/content/res/Resources;Lj3/v;)Lj3/v;

    move-result-object p1

    return-object p1
.end method
