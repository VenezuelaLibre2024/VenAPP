.class public final Lu3/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lh3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh3/g<",
            "Lh3/b;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lh3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh3/g<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "com.bumptech.glide.load.resource.gif.GifOptions.DecodeFormat"

    sget-object v1, Lh3/b;->DEFAULT:Lh3/b;

    invoke-static {v0, v1}, Lh3/g;->f(Ljava/lang/String;Ljava/lang/Object;)Lh3/g;

    move-result-object v0

    sput-object v0, Lu3/i;->a:Lh3/g;

    const-string v0, "com.bumptech.glide.load.resource.gif.GifOptions.DisableAnimation"

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lh3/g;->f(Ljava/lang/String;Ljava/lang/Object;)Lh3/g;

    move-result-object v0

    sput-object v0, Lu3/i;->b:Lh3/g;

    return-void
.end method
