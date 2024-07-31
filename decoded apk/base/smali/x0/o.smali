.class final Lx0/o;
.super Lx0/n;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx0/n<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lx0/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx0/o;

    invoke-direct {v0}, Lx0/o;-><init>()V

    sput-object v0, Lx0/o;->a:Lx0/o;

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lx0/n;-><init>(Lkotlin/jvm/internal/g;)V

    return-void
.end method
