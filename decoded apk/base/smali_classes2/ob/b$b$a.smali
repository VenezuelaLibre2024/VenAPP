.class final enum Lob/b$b$a;
.super Lob/b$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lob/b$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4010
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lob/b$b;-><init>(Ljava/lang/String;ILob/b$a;)V

    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    invoke-static {}, Lob/b;->c()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method
