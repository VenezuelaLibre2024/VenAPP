.class public final Lv7/a0$b;
.super Lv7/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv7/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lv7/z;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;IIJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lv7/z;-><init>(Ljava/lang/Object;IIJ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;J)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lv7/z;-><init>(Ljava/lang/Object;J)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;JI)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lv7/z;-><init>(Ljava/lang/Object;JI)V

    return-void
.end method

.method public constructor <init>(Lv7/z;)V
    .locals 0

    invoke-direct {p0, p1}, Lv7/z;-><init>(Lv7/z;)V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;)Lv7/a0$b;
    .locals 1

    new-instance v0, Lv7/a0$b;

    invoke-super {p0, p1}, Lv7/z;->a(Ljava/lang/Object;)Lv7/z;

    move-result-object p1

    invoke-direct {v0, p1}, Lv7/a0$b;-><init>(Lv7/z;)V

    return-object v0
.end method
