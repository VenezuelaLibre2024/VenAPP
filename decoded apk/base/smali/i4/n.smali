.class public final Li4/n;
.super Li4/r;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li4/n$a;
    }
.end annotation


# static fields
.field public static final b:Li4/n$a;

.field public static final serialVersionUID:J = 0x1L


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Li4/n$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Li4/n$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Li4/n;->b:Li4/n$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Li4/r;-><init>(Ljava/lang/String;)V

    return-void
.end method