.class public final Lck/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lck/s$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lck/s;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lck/s$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lck/s$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lck/s$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lck/s;->a:Lck/s$a;

    return-void
.end method

.method public static b(I)I
    .locals 0

    return p0
.end method
