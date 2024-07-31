.class public Lg0/u$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg0/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field private static a:Lm/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lm/a<",
            "Lw/y;",
            "Lg0/r0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg0/t;

    invoke-direct {v0}, Lg0/t;-><init>()V

    sput-object v0, Lg0/u$a;->a:Lm/a;

    return-void
.end method

.method public static a(Lw/y;)Lg0/r0;
    .locals 1

    sget-object v0, Lg0/u$a;->a:Lm/a;

    invoke-interface {v0, p0}, Lm/a;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg0/r0;

    return-object p0
.end method
