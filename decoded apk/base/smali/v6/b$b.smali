.class public final Lv6/b$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv6/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I


# direct methods
.method private constructor <init>(Ljava/lang/String;IIIIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv6/b$b;->a:Ljava/lang/String;

    iput p2, p0, Lv6/b$b;->b:I

    iput p3, p0, Lv6/b$b;->d:I

    iput p4, p0, Lv6/b$b;->c:I

    iput p5, p0, Lv6/b$b;->e:I

    iput p6, p0, Lv6/b$b;->f:I

    iput p7, p0, Lv6/b$b;->g:I

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;IIIIIILv6/b$a;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, Lv6/b$b;-><init>(Ljava/lang/String;IIIIII)V

    return-void
.end method
