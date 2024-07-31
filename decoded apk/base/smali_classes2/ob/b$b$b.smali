.class final enum Lob/b$b$b;
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

    if-eqz v0, :cond_1

    invoke-static {}, Lob/b;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method
