.class public Ln3/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln3/o;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln3/x$a;,
        Ln3/x$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Model:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ln3/o<",
        "TModel;TModel;>;"
    }
.end annotation


# static fields
.field private static final a:Ln3/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln3/x<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln3/x;

    invoke-direct {v0}, Ln3/x;-><init>()V

    sput-object v0, Ln3/x;->a:Ln3/x;

    return-void
.end method

.method public constructor <init>()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Ln3/x;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ln3/x<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Ln3/x;->a:Ln3/x;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TModel;)Z"
        }
    .end annotation

    const/4 p1, 0x1

    return p1
.end method

.method public b(Ljava/lang/Object;IILh3/h;)Ln3/o$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TModel;II",
            "Lh3/h;",
            ")",
            "Ln3/o$a<",
            "TModel;>;"
        }
    .end annotation

    new-instance p2, Ln3/o$a;

    new-instance p3, Lb4/d;

    invoke-direct {p3, p1}, Lb4/d;-><init>(Ljava/lang/Object;)V

    new-instance p4, Ln3/x$b;

    invoke-direct {p4, p1}, Ln3/x$b;-><init>(Ljava/lang/Object;)V

    invoke-direct {p2, p3, p4}, Ln3/o$a;-><init>(Lh3/f;Lcom/bumptech/glide/load/data/d;)V

    return-object p2
.end method
