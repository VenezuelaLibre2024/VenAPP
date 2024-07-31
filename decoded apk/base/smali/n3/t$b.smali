.class public Ln3/t$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln3/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln3/p<",
        "Ljava/lang/Integer;",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln3/t$b;->a:Landroid/content/res/Resources;

    return-void
.end method


# virtual methods
.method public d(Ln3/s;)Ln3/o;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln3/s;",
            ")",
            "Ln3/o<",
            "Ljava/lang/Integer;",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    new-instance v0, Ln3/t;

    iget-object v1, p0, Ln3/t$b;->a:Landroid/content/res/Resources;

    const-class v2, Landroid/net/Uri;

    const-class v3, Ljava/io/InputStream;

    invoke-virtual {p1, v2, v3}, Ln3/s;->d(Ljava/lang/Class;Ljava/lang/Class;)Ln3/o;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ln3/t;-><init>(Landroid/content/res/Resources;Ln3/o;)V

    return-object v0
.end method
