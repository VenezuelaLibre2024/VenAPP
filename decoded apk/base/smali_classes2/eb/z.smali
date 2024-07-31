.class public abstract Leb/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Leb/z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Leb/z$a;

    invoke-direct {v0}, Leb/z$a;-><init>()V

    sput-object v0, Leb/z;->a:Leb/z;

    return-void
.end method

.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Leb/z;
    .locals 1

    sget-object v0, Leb/z;->a:Leb/z;

    return-object v0
.end method


# virtual methods
.method public abstract a()J
.end method
