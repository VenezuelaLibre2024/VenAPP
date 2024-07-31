.class public Lze/i;
.super Lzb/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lze/i$a;
    }
.end annotation


# instance fields
.field private final a:Lze/i$a;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lzb/m;-><init>(Ljava/lang/String;)V

    sget-object p1, Lze/i$a;->UNKNOWN:Lze/i$a;

    iput-object p1, p0, Lze/i;->a:Lze/i$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lzb/m;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object p1, Lze/i$a;->UNKNOWN:Lze/i$a;

    iput-object p1, p0, Lze/i;->a:Lze/i$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;Lze/i$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lzb/m;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-object p3, p0, Lze/i;->a:Lze/i$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lze/i$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lzb/m;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lze/i;->a:Lze/i$a;

    return-void
.end method
