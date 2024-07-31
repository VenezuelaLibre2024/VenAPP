.class final Lg7/a$b;
.super Lg7/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field public final b:Lt8/e0;


# direct methods
.method public constructor <init>(ILt8/e0;)V
    .locals 0

    invoke-direct {p0, p1}, Lg7/a;-><init>(I)V

    iput-object p2, p0, Lg7/a$b;->b:Lt8/e0;

    return-void
.end method
