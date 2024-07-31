.class public Ln3/t$c;
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
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ln3/p<",
        "Ljava/lang/Integer;",
        "Landroid/net/Uri;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Landroid/content/res/Resources;


# direct methods
.method public constructor <init>(Landroid/content/res/Resources;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln3/t$c;->a:Landroid/content/res/Resources;

    return-void
.end method


# virtual methods
.method public d(Ln3/s;)Ln3/o;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln3/s;",
            ")",
            "Ln3/o<",
            "Ljava/lang/Integer;",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    new-instance p1, Ln3/t;

    iget-object v0, p0, Ln3/t$c;->a:Landroid/content/res/Resources;

    invoke-static {}, Ln3/x;->c()Ln3/x;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Ln3/t;-><init>(Landroid/content/res/Resources;Ln3/o;)V

    return-object p1
.end method
