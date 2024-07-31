.class public Lv3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv3/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lv3/e<",
        "Landroid/graphics/Bitmap;",
        "Landroid/graphics/drawable/BitmapDrawable;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lc4/k;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/res/Resources;

    iput-object p1, p0, Lv3/b;->a:Landroid/content/res/Resources;

    return-void
.end method


# virtual methods
.method public a(Lj3/v;Lh3/h;)Lj3/v;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj3/v<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lh3/h;",
            ")",
            "Lj3/v<",
            "Landroid/graphics/drawable/BitmapDrawable;",
            ">;"
        }
    .end annotation

    iget-object p2, p0, Lv3/b;->a:Landroid/content/res/Resources;

    invoke-static {p2, p1}, Lq3/x;->b(Landroid/content/res/Resources;Lj3/v;)Lj3/v;

    move-result-object p1

    return-object p1
.end method
